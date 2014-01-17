package org.ruboto;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.jruby.embed.io.WriterOutputStream;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Environment;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

import org.ruboto.JRubyAdapter;

public class run {
    public static void main(String[] args) {
        JRubyAdapter.init();
        JRubyAdapter.setUpJRuby(null, null);
        if (args==null || args.length < 1) {
            System.out.println("no script name, run irb");
            JRubyAdapter.runScriptlet(
                        "require \"irb\"\n" +
                        "IRB.start(\"/data/ruby/scripts/irb\")\n"
                        );
            return;
        }
        Script scr = new Script(args[0]);
        try {
            scr.execute();
    	} catch (IOException e) {
        }
    }
}
