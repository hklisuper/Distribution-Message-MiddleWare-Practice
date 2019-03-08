public class ProduceClient {
    public static void main(String[] args) throws Exception{
            new MqClient().produce("Hello world");
    }
}
