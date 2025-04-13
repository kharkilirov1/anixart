package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public final class Exceptions {
    public Exceptions() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m31402a(@NonNull Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
