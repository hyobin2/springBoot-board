package egovframework.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	//Tiles Configurer
	@Bean
	public TilesConfigurer tilesConfigurer() {
		final TilesConfigurer configurer = new TilesConfigurer();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		// tiles.xml 경로
		
		configurer.setDefinitions(new String[] { "classpath:/xml/tiles.xml" });
		 
		
		// 리프레쉬 가능 여부 설정
		configurer.setCheckRefresh(true); 
		
		return configurer;
		
	}
	
	//Tiles View Resolver
	@Bean
	public TilesViewResolver tilesViewResolver() {
		final TilesViewResolver tilesViewResolver = new TilesViewResolver();
		
		tilesViewResolver.setViewClass(TilesView.class); //뷰 우선순위
		tilesViewResolver.setOrder(1);
		 
		return tilesViewResolver;
	}
}
