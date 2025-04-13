package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(@NonNull Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th == null ? new NullPointerException() : th);
    }
}
