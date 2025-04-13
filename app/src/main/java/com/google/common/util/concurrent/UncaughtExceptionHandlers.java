package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.lang.Thread;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlers {

    @VisibleForTesting
    public static final class Exiter implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public static final Logger f22249a = Logger.getLogger(Exiter.class.getName());

        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Thread.UncaughtExceptionHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
            /*
                r7 = this;
                r0 = 0
                java.util.logging.Logger r1 = com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.f22249a     // Catch: java.lang.Throwable -> L17
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L17
                java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L17
                java.lang.String r4 = "Caught an exception in %s.  Shutting down."
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L17
                r6 = 0
                r5[r6] = r8     // Catch: java.lang.Throwable -> L17
                java.lang.String r8 = java.lang.String.format(r3, r4, r5)     // Catch: java.lang.Throwable -> L17
                r1.log(r2, r8, r9)     // Catch: java.lang.Throwable -> L17
                throw r0
            L17:
                r8 = move-exception
                java.io.PrintStream r1 = java.lang.System.err     // Catch: java.lang.Throwable -> L2b
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L2b
                r1.println(r9)     // Catch: java.lang.Throwable -> L2b
                java.io.PrintStream r9 = java.lang.System.err     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2b
                r9.println(r8)     // Catch: java.lang.Throwable -> L2b
                throw r0
            L2b:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.UncaughtExceptionHandlers.Exiter.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }
}
