package com.example.springproject.controllar;

//import com.example.springproject.controllar.entity.Article;
import com.example.springproject.dto.Articleform;
import com.example.springproject.entity.Article;
import com.example.springproject.entity.repository.ArticleRepository;
//import jdk.internal.module.IllegalAccessLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@Slf4j //로깅을 위한 어노테이션(문법)
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결해줌
    private ArticleRepository articleRepository;

    @GetMapping("articles/view")
    public String Articles() {
        return "articles/view";
    }

    @PostMapping("/articles/create")//view.mustache의 method가 post라 postmapping으로 보내야함
    public String createArticle(Articleform form) {
        log.info(form.toString());
        //System.out.println(form.toString());//이렇게 쓰면 서버에 남지도 않고 서버 성능에 악영향 끼침
        // --> 대신 로깅 기능으로 대체

        //1. dto를 변환 entity
        Article article = form.toEntity();
        log.info(article.toString());
        //System.out.println(article.toString());

        //2. repository에게 entity를 db안에 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        //System.out.println(saved.toString());

        return "redirect:/articles/" + saved.getId();//getId()는 @Getter를 사용함
    }

    @GetMapping("/articles/{id}") // 중괄호안에 수는 변하는 수
    public String show(@PathVariable Long id, Model model) {//@PathVariable은 위에 써진 url 경로로 부터 받는다
        log.info("id = " + id);

        // 1. id로 데이터 가져옴
        Article articleEntity = articleRepository.findById(id).orElse(null); // 해당 id 값이 없으면 null을 반환해라

        // 2. 가져온 데이터를 모델에 등록
        model.addAttribute("article", articleEntity); // articleEntity를 view페이지에서 쓸수있음

        // 3. 보여줄 페이지를 설정

        return "redirect:/articles/";
    }

    @GetMapping("/articles") // 이 요청이 들어오면 여기에 있는 메소드가 수행되고 결과적으로 view페이지 설정
    public String index(Model model) {

        // 1. 모든 article을 가져온다
        List<Article> articleEntityList = articleRepository.findAll(); // 모든 데이터 가져오기

        // 2. 가져온 article 묶음을 뷰로 전달
        model.addAttribute("articleList", articleEntityList);// 앞에는 이름 만들고 뒤에는 던져줄 데이터
        //여기의 이름은 index.mustache에 사용
        // 3. 뷰 페이지를 설정
        return "articles/index"; // articles/index.mustache
    }

    @GetMapping("/articles/{id}/edit") // 여기선 중괄호 2개 아닌 1개
    public String edit(@PathVariable Long id, Model model) {
        // 수정할 데이터를 가져오기
        Article articleEntitys = articleRepository.findById(id).orElse(null);

        // 모델에 데이터 등록
        model.addAttribute("article", articleEntitys);

        // 뷰 페이지 설정
        return "articles/edit";
    }

    @PostMapping("/articles/update")
    public String Update(Articleform form) {
        log.info(form.toString());

        // 1. DTO를 엔티티로 변환
        Article articleEntity = form.toEntity();
        log.info(articleEntity.toString());

        // 2. 엔티티를 DB로 저장
        // 2-1. DB에서 기존 데이터를 가져온다
        Article target = articleRepository.findById(articleEntity.getId()).orElse(null);

        // 2-2. 기존 데이터의 값을 갱신 또는 수정
        if(target != null){
            articleRepository.save(articleEntity); // 엔티티가 DB로 갱신
        }

       // 3. 수정 결과 페이지로 리다이렉트 한다
        return "redirect:/articles/"+ articleEntity.getId();
    }
    @GetMapping("/articles/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes rttr) {
        log.info("삭제 요청이 들어왔습니다");

        // 1. 삭제 대상을 가져온다
        Article target = articleRepository.findById(id).orElse(null);
        // 2. 그 대상을 삭제한다
        if(target != null) {
            articleRepository.delete(target);
            rttr.addAttribute("msg", "삭제완료");
        }
        // 3. 결과 페이지로 리다이렉트한다
        return "redirect:/articles";
    }
}
