package com.example.springbootapitest.cutpoint;

/**
 * @Author zhangdx
 * @CreateDate 2023/9/12 15:49
 * @Describe todo
 */
public class HelloValidatorImpl implements HelloValidator {
    @Override
    public boolean validate(String arg) {

        if (arg.toLowerCase().contains("fuck")) {
            System.out.println("fuck you 2");
            return false;
        }

        return true;
    }
}
