package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.logging.Logger;

@GwtCompatible
/* loaded from: classes.dex */
final class Platform {

    /* renamed from: a */
    public static final PatternCompiler f20534a;

    public static final class JdkPatternCompiler implements PatternCompiler {
        public JdkPatternCompiler() {
        }

        public JdkPatternCompiler(C15661 c15661) {
        }
    }

    static {
        Logger.getLogger(Platform.class.getName());
        f20534a = new JdkPatternCompiler(null);
    }
}
