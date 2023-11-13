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

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "分类实体类")
public class Category extends BaseEntity {

    @Schema(description = "分类名称")
    private String name;

    @Schema(description = "分类图片url")
    private String imageUrl;

    @Schema(description = "父节点id")
    private Long parentId;

    @Schema(description = "分类状态: 是否显示[0-不显示，1显示]")
    private Integer status;

    @Schema(description = "排序字段")
    private Integer orderNum;

    @Schema(description = "是否存在子节点")
    private Boolean hasChildren;

    @Schema(description = "子节点List集合")
    private List<Category> children;
}
