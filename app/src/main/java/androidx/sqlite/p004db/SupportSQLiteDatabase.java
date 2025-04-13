package androidx.sqlite.p004db;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    /* renamed from: E */
    List<Pair<String, String>> mo4030E();

    /* renamed from: H */
    void mo4031H(int i2);

    /* renamed from: I */
    void mo4032I(String str) throws SQLException;

    /* renamed from: I0 */
    Cursor mo4033I0(SupportSQLiteQuery supportSQLiteQuery);

    /* renamed from: L */
    SupportSQLiteStatement mo4034L(String str);

    /* renamed from: Q0 */
    boolean mo4035Q0();

    @RequiresApi
    /* renamed from: W0 */
    boolean mo4036W0();

    @RequiresApi
    /* renamed from: Y */
    Cursor mo4037Y(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    boolean isOpen();

    /* renamed from: j0 */
    void mo4038j0();

    /* renamed from: k0 */
    void mo4039k0();

    /* renamed from: q0 */
    Cursor mo4040q0(String str);

    /* renamed from: t */
    String mo4041t();

    /* renamed from: w0 */
    void mo4042w0();

    /* renamed from: y */
    void mo4043y();
}
