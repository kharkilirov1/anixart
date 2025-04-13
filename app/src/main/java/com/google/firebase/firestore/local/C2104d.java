package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.firestore.local.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2104d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f22833a;

    /* renamed from: b */
    public final /* synthetic */ Object f22834b;

    /* renamed from: c */
    public final /* synthetic */ Object f22835c;

    public /* synthetic */ C2104d(Object obj, Object obj2, int i2) {
        this.f22833a = i2;
        this.f22835c = obj;
        this.f22834b = obj2;
    }

    @Override // com.google.firebase.firestore.util.Consumer
    public final void accept(Object obj) {
        switch (this.f22833a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f22835c;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) this.f22834b;
                zArr[0] = true;
                String string = ((Cursor) obj).getString(0);
                ResourcePath m12404a = EncodedPath.m12404a(string);
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindLong(1, m12404a.m12434i());
                sQLiteStatement.bindString(2, string);
                Assert.m12490b(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
                break;
            case 1:
                MemoryIndexManager.MemoryCollectionParentIndex memoryCollectionParentIndex = (MemoryIndexManager.MemoryCollectionParentIndex) this.f22835c;
                SQLiteStatement sQLiteStatement2 = (SQLiteStatement) this.f22834b;
                ResourcePath resourcePath = (ResourcePath) obj;
                if (memoryCollectionParentIndex.m12406a(resourcePath)) {
                    String m12431e = resourcePath.m12431e();
                    ResourcePath m12436k = resourcePath.m12436k();
                    sQLiteStatement2.clearBindings();
                    sQLiteStatement2.bindString(1, m12431e);
                    sQLiteStatement2.bindString(2, EncodedPath.m12405b(m12436k));
                    sQLiteStatement2.execute();
                    break;
                }
                break;
            default:
                SQLiteSchema sQLiteSchema = (SQLiteSchema) this.f22835c;
                String str = (String) this.f22834b;
                Objects.requireNonNull(sQLiteSchema);
                int i2 = ((Cursor) obj).getInt(0);
                SQLiteStatement compileStatement = sQLiteSchema.f22815a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
                compileStatement.bindString(1, str);
                compileStatement.bindLong(2, i2);
                Assert.m12490b(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i2));
                sQLiteSchema.f22815a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i2)});
                break;
        }
    }
}
