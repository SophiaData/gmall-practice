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
package io.sophiadata.gmall.model.vo.h5;

import com.alibaba.fastjson.JSONArray;
import io.sophiadata.gmall.model.entity.product.Product;
import io.sophiadata.gmall.model.entity.product.ProductSku;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

/** (@sophiadata) (@date 2023/11/13 11:06). */
@Data
@Schema(description = "商品详情对象")
public class ProductItemVo {

    @Schema(description = "商品sku信息")
    private ProductSku productSku;

    @Schema(description = "商品信息")
    private Product product;

    @Schema(description = "商品轮播图列表")
    private List<String> sliderUrlList;

    @Schema(description = "商品详情图片列表")
    private List<String> detailsImageUrlList;

    @Schema(description = "商品规格信息")
    private JSONArray specValueList;

    @Schema(description = "商品规格对应商品skuId信息")
    private Map<String, Object> skuSpecValueMap;
}
