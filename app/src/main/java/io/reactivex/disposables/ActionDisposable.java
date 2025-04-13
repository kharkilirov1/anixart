package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.util.ExceptionHelper;

/* loaded from: classes3.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    @Override // io.reactivex.disposables.ReferenceDisposable
    /* renamed from: a */
    public void mo31391a(@NonNull Action action) {
        try {
            action.run();
        } catch (Throwable th) {
            throw ExceptionHelper.m31821e(th);
        }
    }
}
