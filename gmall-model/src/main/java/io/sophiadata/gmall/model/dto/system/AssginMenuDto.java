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
package io.sophiadata.gmall.model.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

/** (@sophiadata) (@date 2023/11/13 10:47). */
@Data
@Schema(description = "请求参数实体类")
public class AssginMenuDto {

    @Schema(description = "角色id")
    private Long roleId; // 角色id

    @Schema(description = "选中的菜单id的集合")
    private List<Map<String, Number>> menuIdList; // 选中的菜单id的集合; Map的键表示菜单的id，值表示是否为半开; 0否，1是
}
