package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public abstract class Subject<T> extends Observable<T> implements Observer<T> {
    @NonNull
    /* renamed from: o */
    public final Subject<T> m31870o() {
        return this instanceof SerializedSubject ? this : new SerializedSubject(this);
    }
}
