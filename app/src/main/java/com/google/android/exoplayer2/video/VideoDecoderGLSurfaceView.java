package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {

    /* renamed from: b */
    public final Renderer f14860b;

    public static final class Renderer implements GLSurfaceView.Renderer {

        /* renamed from: k */
        public static final float[] f14861k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l */
        public static final String[] f14862l = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: m */
        public static final FloatBuffer f14863m = GlUtil.m7556c(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: b */
        public final GLSurfaceView f14864b;

        /* renamed from: c */
        public final int[] f14865c = new int[3];

        /* renamed from: d */
        public final int[] f14866d = new int[3];

        /* renamed from: e */
        public final int[] f14867e = new int[3];

        /* renamed from: f */
        public final int[] f14868f = new int[3];

        /* renamed from: g */
        public final AtomicReference<VideoDecoderOutputBuffer> f14869g = new AtomicReference<>();

        /* renamed from: h */
        public GlUtil.Program f14870h;

        /* renamed from: i */
        public int f14871i;

        /* renamed from: j */
        public VideoDecoderOutputBuffer f14872j;

        public Renderer(GLSurfaceView gLSurfaceView) {
            this.f14864b = gLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.f14867e;
                this.f14868f[i2] = -1;
                iArr[i2] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer andSet = this.f14869g.getAndSet(null);
            if (andSet == null && this.f14872j == null) {
                return;
            }
            if (andSet != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.f14872j;
                if (videoDecoderOutputBuffer != null) {
                    Objects.requireNonNull(videoDecoderOutputBuffer);
                    throw null;
                }
                this.f14872j = andSet;
            }
            Objects.requireNonNull(this.f14872j);
            GLES20.glUniformMatrix3fv(this.f14871i, 1, false, f14861k, 0);
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            GlUtil.Program program = new GlUtil.Program("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f14870h = program;
            program.m7565c();
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f14870h.f14640a, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f14863m);
            this.f14866d[0] = GLES20.glGetAttribLocation(this.f14870h.f14640a, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f14866d[0]);
            this.f14866d[1] = GLES20.glGetAttribLocation(this.f14870h.f14640a, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f14866d[1]);
            this.f14866d[2] = GLES20.glGetAttribLocation(this.f14870h.f14640a, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f14866d[2]);
            GlUtil.m7555b();
            this.f14871i = GLES20.glGetUniformLocation(this.f14870h.f14640a, "mColorConversion");
            GlUtil.m7555b();
            GLES20.glGenTextures(3, this.f14865c, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(this.f14870h.m7564b(f14862l[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f14865c[i2]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            GlUtil.m7555b();
            GlUtil.m7555b();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        super(context, null);
        Renderer renderer = new Renderer(this);
        this.f14860b = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        Renderer renderer = this.f14860b;
        if (renderer.f14869g.getAndSet(videoDecoderOutputBuffer) != null) {
            throw null;
        }
        renderer.f14864b.requestRender();
    }
}
