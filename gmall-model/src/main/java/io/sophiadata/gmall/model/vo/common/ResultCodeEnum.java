/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.sophiadata.gmall.model.vo.common;

import lombok.Getter;

/** (@sophiadata) (@date 2023/11/13 11:04). */
@Getter // 提供获取属性值的getter方法
public enum ResultCodeEnum {
    SUCCESS(200, "操作成功"),
    LOGIN_ERROR(201, "用户名或者密码错误"),
    VALIDATECODE_ERROR(202, "验证码错误"),
    LOGIN_AUTH(208, "用户未登录"),
    USER_NAME_IS_EXISTS(209, "用户名已经存在"),
    SYSTEM_ERROR(9999, "您的网络有问题请稍后重试"),
    NODE_ERROR(217, "该节点下有子节点，不可以删除"),
    DATA_ERROR(204, "数据异常"),
    ACCOUNT_STOP(216, "账号已停用"),

    STOCK_LESS(219, "库存不足"),
    ;

    private final Integer code; // 业务状态码
    private final String message; // 响应消息

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
