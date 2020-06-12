/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.core.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * diboot-core配置文件类
 * @author mazc@dibo.ltd
 * @version v2.0
 * @date 2019/08/06
 */
@ConfigurationProperties(prefix = "diboot.core")
public class CoreProperties {

    /**
     * 是否初始化，默认true自动安装SQL
     */
    private boolean initSql = true;

    /**
     * kv查询的长度
     */
    private Integer kvLimitCount = 100;

    public boolean isInitSql() {
        return initSql;
    }

    public void setInitSql(boolean initSql) {
        this.initSql = initSql;
    }

    public Integer getKvLimitCount() {
        return kvLimitCount;
    }

    public void setKvLimitCount(Integer kvLimitCount) {
        this.kvLimitCount = kvLimitCount;
    }
}
