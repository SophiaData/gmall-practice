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

import io.sophiadata.gmall.model.entity.product.Category;
import io.sophiadata.gmall.model.entity.product.ProductSku;
import lombok.Data;

import java.util.List;

/** (@sophiadata) (@date 2023/11/13 11:05). */
@Data
public class IndexVo {

    private List<Category> categoryList; // 一级分类的类别数据
    private List<ProductSku> productSkuList; // 畅销产品列表数据
}
