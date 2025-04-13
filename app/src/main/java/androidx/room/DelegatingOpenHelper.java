package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.p004db.SupportSQLiteOpenHelper;

/* loaded from: classes.dex */
interface DelegatingOpenHelper {
    @NonNull
    SupportSQLiteOpenHelper getDelegate();
}
