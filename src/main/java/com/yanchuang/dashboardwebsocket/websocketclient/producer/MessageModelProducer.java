package com.yanchuang.dashboardwebsocket.websocketclient.producer;

import com.yanchuang.dashboardwebsocket.rocketmq.producer.BaseProducer;
import com.yanchuang.dashboardwebsocket.websocket.entity.message.MessageModel;
import org.apache.commons.lang3.SerializationUtils;

/**
 * @author lonely lee
 * @date 2019/05/17 10:55
 * @since v1.0
 */
public class MessageModelProducer extends BaseProducer<MessageModel> {
    public MessageModelProducer(String producerName, String topicName, String tagName) {
        super(producerName, topicName, tagName);
    }

    @Override
    protected byte[] transformMessage(MessageModel messageModel) {
        return SerializationUtils.serialize(messageModel);
    }
}
