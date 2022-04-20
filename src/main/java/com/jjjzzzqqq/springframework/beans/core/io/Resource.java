package com.jjjzzzqqq.springframework.beans.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源类接口
 * 职责：获取资源的InputStream
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
