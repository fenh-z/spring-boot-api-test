package com.example.extensions.java.util.List;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

import java.util.List;

/**
 * @Author zhangdx
 * @CreateDate 2023/11/10 09:48
 * @Describe todo
 */
@Extension
public class ListExt {

    public static boolean isNotEmpty(@This List<?> self) {
        return (self != null && self.size() > 0);
    }

}
