/*
 * Copyright (C) 2019~2023 dinstone<dinstone@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package doha.samples.msa.adapter.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dinstone.focus.annotation.ServiceDefinition;
import doha.samples.msa.api.rpc.OrderRequest;
import doha.samples.msa.api.rpc.OrderResponse;
import doha.samples.msa.api.rpc.OrderRpcApi;
import doha.samples.msa.port.service.OrderCommandService;

@Component
@ServiceDefinition
public class OrderRpcSpi implements OrderRpcApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderRpcSpi.class);

    @Autowired
    private OrderCommandService orderCommandService;

    @Override
    public OrderResponse createOrder(OrderRequest order) {
        LOGGER.info("user id = {}", order.getUid());
        String id = orderCommandService.createOrder(order.getUid(), order.getPoi(), order.getSn());
        return new OrderResponse().setOid(id);
    }

}
