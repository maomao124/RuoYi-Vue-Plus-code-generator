package org.dromara.generator.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：RuoYi-Vue-Plus
 * Package(包名): org.dromara.generator.service
 * Class(类名): BasePackageServiceImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2024/9/25
 * Time(创建时间)： 14:57
 * Version(版本): 1.0
 * Description(描述)： 无
 *
 * @author mao
 */

@Slf4j
@Service
public class BasePackageServiceImpl implements BasePackageService
{
    @Value("${gen.basePackageName}")
    private String basePackageName;

    @Override
    public String getBasePackageName()
    {
        return basePackageName;
    }
}
