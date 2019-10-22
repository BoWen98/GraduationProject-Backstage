package com.bowen.framework.domain.order.request;

import com.bowen.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
 * /3/26.
 */
@Data
@ToString
public class CreateOrderRequest extends RequestData {

    String courseId;

}
