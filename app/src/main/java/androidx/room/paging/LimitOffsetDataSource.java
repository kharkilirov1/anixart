package androidx.room.paging;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

@RestrictTo
/* loaded from: classes.dex */
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* renamed from: androidx.room.paging.LimitOffsetDataSource$1 */
    class C05741 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        /* renamed from: a */
        public void mo4069a(@NonNull Set<String> set) {
            LimitOffsetDataSource limitOffsetDataSource = null;
            limitOffsetDataSource.invalidate();
            throw null;
        }
    }
}
