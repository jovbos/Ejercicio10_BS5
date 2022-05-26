package paquete;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaLogs {
    public static final Logger LOG = LoggerFactory.getLogger(PruebaLogs.class);

    @GetMapping
    public String index() {

            LOG.trace("trace de prueba");
            LOG.debug("debug de prueba");
            LOG.info("info de prueba");
            LOG.warn("warn de prueba");
            LOG.error("error de prueba");
            return "return";
    }

}
