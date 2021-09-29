package com.cxw.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPconfig {
    // 逻辑删除组件！
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
}
