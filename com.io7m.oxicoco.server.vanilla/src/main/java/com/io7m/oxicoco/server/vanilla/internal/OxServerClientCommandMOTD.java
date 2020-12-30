/*
 * Copyright © 2020 Mark Raynsford <code@io7m.com> http://io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.io7m.oxicoco.server.vanilla.internal;

import com.io7m.oxicoco.messages.OxIRCMessage;

import java.io.BufferedWriter;
import java.io.IOException;

import static com.io7m.oxicoco.errors.OxIRCReply.RPL_ENDOFMOTD;
import static com.io7m.oxicoco.errors.OxIRCReply.RPL_MOTD;
import static com.io7m.oxicoco.errors.OxIRCReply.RPL_MOTDSTART;

public final class OxServerClientCommandMOTD
  implements OxServerClientCommandHandlerType
{
  public OxServerClientCommandMOTD()
  {

  }

  @Override
  public void execute(
    final OxServerClientCommandContextType context,
    final BufferedWriter lineWriter,
    final OxIRCMessage message)
    throws IOException
  {
    final var configuration = context.configuration();
    final var motdNow = configuration.motd().get();
    final var hostName = configuration.serverName().value();

    context.sendReply(RPL_MOTDSTART, ": " + hostName + " message of the day:");
    for (final var line : motdNow) {
      context.sendReply(RPL_MOTD, ": " + line);
    }
    context.sendReply(RPL_ENDOFMOTD);
  }
}