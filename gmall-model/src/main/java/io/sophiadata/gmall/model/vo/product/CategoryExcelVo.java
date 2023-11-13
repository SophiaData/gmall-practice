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
package io.sophiadata.gmall.model.vo.product;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** (@sophiadata) (@date 2023/11/13 11:07). */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryExcelVo {

    @ExcelProperty(value = "id", index = 0)
    private Long id;

    @ExcelProperty(value = "名称", index = 1)
    private String name;

    @ExcelProperty(value = "图片url", index = 2)
    private String imageUrl;

    @ExcelProperty(value = "上级id", index = 3)
    private Long parentId;

    @ExcelProperty(value = "状态", index = 4)
    private Integer status;

    @ExcelProperty(value = "排序", index = 5)
    private Integer orderNum;
}
