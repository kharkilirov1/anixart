package com.yandex.metrica.push.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class TrackersHub implements Tracker {

    /* renamed from: b */
    private static final TrackersHub f47249b = new TrackersHub();

    /* renamed from: a */
    @NonNull
    private final List<Tracker> f47250a = new CopyOnWriteArrayList();

    @NonNull
    public static TrackersHub getInstance() {
        return f47249b;
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void pauseSession() {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().pauseSession();
        }
    }

    public void registerTracker(@NonNull Tracker tracker) {
        this.f47250a.add(tracker);
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportError(@NonNull String str, @Nullable Throwable th) {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().reportError(str, th);
        }
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportEvent(@NonNull String str) {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().reportEvent(str);
        }
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportUnhandledException(@NonNull Throwable th) {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().reportUnhandledException(th);
        }
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void resumeSession() {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().resumeSession();
        }
    }

    @Override // com.yandex.metrica.push.common.utils.Tracker
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        Iterator<Tracker> it = this.f47250a.iterator();
        while (it.hasNext()) {
            it.next().reportEvent(str, map);
        }
    }
}
