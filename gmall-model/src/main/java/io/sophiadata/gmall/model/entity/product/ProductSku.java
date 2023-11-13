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

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "ProductSku")
public class ProductSku extends BaseEntity {

    @Schema(description = "商品编号")
    private String skuCode;

    @Schema(description = "skuName")
    private String skuName;

    @Schema(description = "商品ID")
    private Long productId;

    @Schema(description = "缩略图路径")
    private String thumbImg;

    @Schema(description = "售价")
    private BigDecimal salePrice;

    @Schema(description = "市场价")
    private BigDecimal marketPrice;

    @Schema(description = "成本价")
    private BigDecimal costPrice;

    @Schema(description = "库存数")
    private Integer stockNum;

    @Schema(description = "销量")
    private Integer saleNum;

    @Schema(description = "sku规格信息json")
    private String skuSpec;

    @Schema(description = "重量")
    private String weight;

    @Schema(description = "体积")
    private String volume;

    @Schema(description = "线上状态：0-初始值，1-上架，-1-自主下架")
    private Integer status;
}
