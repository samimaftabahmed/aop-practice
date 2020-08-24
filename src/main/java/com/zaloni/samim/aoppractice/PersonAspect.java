package com.zaloni.samim.aoppractice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {

    private boolean pointCutCalled = false;

    @Before("execution(* com.zaloni.samim.aoppractice.Person.*(..))")
    public void pointCut() {
        System.out.println("pointCut");
        pointCutCalled = true;
    }

    public boolean isPointCutCalled() {
        return pointCutCalled;
    }

    public void setPointCutCalled(boolean pointCutCalled) {
        this.pointCutCalled = pointCutCalled;
    }
}
