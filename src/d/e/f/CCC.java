/*
 * Copyright IrsCo (c) 2010.
 */

package d.e.f;

import a.b.c.AAA;
import a.b.cc.QQQ;

/**
 * by Irina.Petrovskaya, on 15.11.10, 15:23
 */
public class CCC extends Dummy implements DDD {
    @Override
    public AAA foo(QQQ qqq) {
        return null;
    }

    public static class InnerCCC  {

        String aaa;

        public String getAaa() {
            return aaa;
        }

        public void setAaa(String aaa) {
            this.aaa = aaa;
        }
    }
}
