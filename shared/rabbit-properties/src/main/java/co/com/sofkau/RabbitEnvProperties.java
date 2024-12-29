package co.com.sofkau;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:rabbit-application.properties")
public class RabbitEnvProperties {

    @Value("${account.exchange.name}")
    private String accountExchange;

    @Value("${account.queue.name}")
    private String accountQueue;

    @Value("${account.routing.key}")
    private String accountRoutingKey;

    @Value("${card.exchange.name}")
    private String cardExchange;

    @Value("${card.queue.name}")
    private String cardQueue;

    @Value("${card.routing.key}")
    private String cardRoutingKey;

    @Value("${transaction.exchange.name}")
    private String transactionExchange;

    @Value("${transaction.queue.name}")
    private String transactionQueue;

    @Value("${transaction.routing.key}")
    private String transactionRoutingKey;

    public String getAccountExchange() {
        return accountExchange;
    }

    public String getAccountQueue() {
        return accountQueue;
    }

    public String getAccountRoutingKey() {
        return accountRoutingKey;
    }

    public String getCardExchange() {
        return cardExchange;
    }

    public String getCardQueue() {
        return cardQueue;
    }

    public String getCardRoutingKey() {
        return cardRoutingKey;
    }

    public String getTransactionExchange() {
        return transactionExchange;
    }

    public String getTransactionQueue() {
        return transactionQueue;
    }

    public String getTransactionRoutingKey() {
        return transactionRoutingKey;
    }
    public String[] getAllQueues(){
        return new String[] {getAccountQueue(), getCardQueue(), getTransactionQueue()};
    }
}