package pl.aprilapps.easyphotopicker;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Files.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "", "run"}, m31885k = 3, m31886mv = {1, 1, 15})
/* loaded from: classes3.dex */
final class Files$copyFilesInSeparateThread$1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f69346b;

    /* renamed from: c */
    public final /* synthetic */ String f69347c;

    /* renamed from: d */
    public final /* synthetic */ Context f69348d;

    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f69346b.iterator();
        int i2 = 1;
        while (true) {
            if (!it.hasNext()) {
                Context context = this.f69348d;
                String[] strArr = new String[arrayList.size()];
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    strArr[i3] = ((File) arrayList.get(i3)).toString();
                }
                MediaScannerConnection.scanFile(context, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: pl.aprilapps.easyphotopicker.Files$scanCopiedImages$1
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(@NotNull String path, @NotNull Uri uri) {
                        Intrinsics.m32180i(path, "path");
                        Intrinsics.m32180i(uri, "uri");
                        Log.d("", "Scanned " + path + ':');
                        StringBuilder sb = new StringBuilder();
                        sb.append("-> uri=");
                        sb.append(uri);
                        Log.d("", sb.toString());
                    }
                });
                return;
            }
            File file = (File) it.next();
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.f69347c);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String name = file.getName();
            Intrinsics.m32175d(name, "fileToCopy.name");
            List<String> m33874f = new Regex("\\.").m33874f(name, 0);
            if (!m33874f.isEmpty()) {
                ListIterator<String> listIterator = m33874f.listIterator(m33874f.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        collection = CollectionsKt.m32018e0(m33874f, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.f63144b;
            Object[] array = collection.toArray(new String[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            StringBuilder m24u = C0000a.m24u(".");
            m24u.append(((String[]) array)[r4.length - 1]);
            String sb = m24u.toString();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            Calendar calendar = Calendar.getInstance();
            Intrinsics.m32175d(calendar, "Calendar.getInstance()");
            String format = simpleDateFormat.format(calendar.getTime());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IMG_");
            sb2.append(format);
            sb2.append('_');
            sb2.append(i2);
            sb2.append('.');
            File file3 = new File(file2, C0000a.m20q(sb2, sb, "%d.%s"));
            try {
                file3.createNewFile();
                Files.f69345a.m34987b(new FileInputStream(file), file3);
                arrayList.add(file3);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            i2++;
        }
    }
}
