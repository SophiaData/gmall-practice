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

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "用户地址实体类")
public class UserAddress extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;


    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "name")
    private String name;

    @Schema(description = "电话")
    private String phone;

    @Schema(description = "标签名称")
    private String tagName;

    @Schema(description = "provinceCode")
    private String provinceCode;

    @Schema(description = "cityCode")
    private String cityCode;

    @Schema(description = "districtCode")
    private String districtCode;

    @Schema(description = "详细地址")
    private String address;

    @Schema(description = "完整地址")
    private String fullAddress;

    @Schema(description = "是否默认地址（0：否 1：是）")
    private Integer isDefault;
}
