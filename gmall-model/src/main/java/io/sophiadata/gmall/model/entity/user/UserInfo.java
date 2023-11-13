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
package io.sophiadata.gmall.model.entity.user;

import io.sophiadata.gmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "用户实体类")
public class UserInfo extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "昵称")
    private String nickName;

    @Schema(description = "头像")
    private String avatar;

    @Schema(description = "性别")
    private Integer sex;

    @Schema(description = "电话号码")
    private String phone;

    @Schema(description = "备注")
    private String memo;

    @Schema(description = "微信open id")
    private String openId;

    @Schema(description = "微信开放平台unionID")
    private String unionId;

    @Schema(description = "最后一次登录ip")
    private String lastLoginIp;

    @Schema(description = "最后一次登录时间")
    private Date lastLoginTime;

    @Schema(description = "状态：1为正常，0为禁止")
    private Integer status;
}
