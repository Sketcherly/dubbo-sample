package li.dongpo.tc.service;

import li.dongpo.tc.SampleService;
import org.springframework.stereotype.Service;

/**
 * User: dongpo.li
 * Date: 2020-05-14
 */
@Service
public class SampleServiceImpl implements SampleService {
    public String serve() {
        return "hello world";
    }
}
