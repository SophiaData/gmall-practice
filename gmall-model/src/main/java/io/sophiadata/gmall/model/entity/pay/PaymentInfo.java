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
package io.sophiadata.gmall.model.entity.pay;

import io.sophiadata.gmall.model.entity.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.math.BigDecimal;
import java.util.Date;

/** (@sophiadata) (@date 2023/11/13 10:57). */
@Data
@EqualsAndHashCode(callSuper = false)
@Schema(description = "支付信息实体类")
public class PaymentInfo extends BaseEntity {
    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "订单号")
    private String orderNo;

    @Schema(description = "付款方式：1-微信 2-支付宝")
    private Integer payType;

    @Schema(description = "交易编号（微信或支付）")
    private String outTradeNo;

    @Schema(description = "支付金额")
    private BigDecimal amount;

    @Schema(description = "交易内容")
    private String content;

    @Schema(description = "支付状态：0-未支付 1-已支付")
    private Integer paymentStatus;

    @Schema(description = "回调时间")
    private Date callbackTime;

    @Schema(description = "回调信息")
    private String callbackContent;
}
