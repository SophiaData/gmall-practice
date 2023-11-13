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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/** (@sophiadata) (@date 2023/11/13 11:03). */
@Data
@Schema(description = "响应结果实体类")
public class Result<T> {

    // 返回码
    @Schema(description = "业务状态码")
    private Integer code;

    // 返回消息
    @Schema(description = "响应消息")
    private String message;

    // 返回数据
    @Schema(description = "业务数据")
    private T data;

    // 私有化构造
    private Result() {}

    // 返回数据
    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<>();
        result.setData(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    // 通过枚举构造Result对象
    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        return build(body, resultCodeEnum.getCode(), resultCodeEnum.getMessage());
    }
}
