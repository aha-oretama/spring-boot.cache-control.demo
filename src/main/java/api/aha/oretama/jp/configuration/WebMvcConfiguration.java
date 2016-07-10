package api.aha.oretama.jp.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		CacheControl.empty().cachePublic();
		registry.addResourceHandler("/api/v1/prefectures").addResourceLocations("/api.aha.oretama.jp/controller")
				.setCacheControl(CacheControl.maxAge(24 * 30, TimeUnit.HOURS));
	}
}