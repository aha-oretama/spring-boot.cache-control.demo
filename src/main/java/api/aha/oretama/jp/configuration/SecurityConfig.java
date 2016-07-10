package api.aha.oretama.jp.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import api.aha.oretama.jp.configuration.header.CacheControlHeadersWriter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().permitAll();

		CacheControlHeadersWriter headersWriter = new CacheControlHeadersWriter();
		http.antMatcher("/api/v1/prefectures/**").headers().cacheControl().disable().addHeaderWriter(headersWriter);
	}

}
