package com.google.android.gms.common.sqlite;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i2, @NonNull CursorWindow cursorWindow) {
        throw null;
    }

    @Override // android.database.CrossProcessCursor
    @Nullable
    @KeepForSdk
    public CursorWindow getWindow() {
        throw null;
    }

    @Override // android.database.CursorWrapper
    @NonNull
    public final /* synthetic */ Cursor getWrappedCursor() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i2, int i3) {
        throw null;
    }
}
