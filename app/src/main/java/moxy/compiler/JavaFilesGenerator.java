package moxy.compiler;

import com.squareup.javapoet.JavaFile;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface JavaFilesGenerator<T> {
    @NotNull
    List<JavaFile> generate(T t);
}
