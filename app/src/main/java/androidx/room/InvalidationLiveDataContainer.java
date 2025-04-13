package androidx.room;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
class InvalidationLiveDataContainer {

    /* renamed from: a */
    @VisibleForTesting
    public final Set<LiveData> f5777a = Collections.newSetFromMap(new IdentityHashMap());

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
    }
}
