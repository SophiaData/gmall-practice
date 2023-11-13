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
package io.sophiadata.gmall.model.entity.product;

import io.sophiadata.gmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "分类品牌实体类")
public class CategoryBrand extends BaseEntity {

    @Schema(description = "品牌id")
    private Long brandId;

    @Schema(description = "分类id")
    private Long categoryId;

    @Schema(description = "分类名称", requiredProperties = "false")
    private String categoryName;

    @Schema(description = "品牌名称", requiredProperties = "false")
    private String brandName;

    @Schema(description = "品牌logo", requiredProperties = "false")
    private String logo;
}