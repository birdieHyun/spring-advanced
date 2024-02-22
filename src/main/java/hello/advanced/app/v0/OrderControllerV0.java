package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {

    private final OrderServiceV0 orderService;

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }

    @GetMapping("/v0/test")
    public String test(@ModelAttribute TestDto dto) {
        System.out.println(dto.getTest1());
        System.out.println(dto.getTest2());

//        System.out.println("test1 = " + test1);
//        System.out.println("test2 = " + test2);

        return "ok";
    }
}
