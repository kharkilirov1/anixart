package kotlin.p033io;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"kotlin/io/FilesKt__FilePathComponentsKt", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/FilesKt__FileTreeWalkKt", "kotlin/io/FilesKt__UtilsKt"}, m31885k = 4, m31886mv = {1, 7, 1}, m31888xi = C4632R.styleable.AppCompatTheme_checkedTextViewStyle)
/* loaded from: classes3.dex */
public final class FilesKt extends FilesKt__UtilsKt {
    @NotNull
    /* renamed from: a */
    public static String m32140a(@NotNull File file) {
        Intrinsics.m32179h(file, "<this>");
        String name = file.getName();
        Intrinsics.m32178g(name, "name");
        return StringsKt.m33902b0(name, '.', "");
    }

    /* renamed from: b */
    public static String m32141b(File file, Charset charset, int i2, Object obj) {
        Charset charset2 = (i2 & 1) != 0 ? Charsets.f66855b : null;
        Intrinsics.m32179h(file, "<this>");
        Intrinsics.m32179h(charset2, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset2);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            Intrinsics.m32178g(stringWriter2, "buffer.toString()");
            CloseableKt.m32138a(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    /* renamed from: c */
    public static void m32142c(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.m32179h(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            CloseableKt.m32138a(fileOutputStream, null);
        } finally {
        }
    }
}
