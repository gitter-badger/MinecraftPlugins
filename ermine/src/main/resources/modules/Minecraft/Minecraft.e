module Minecraft.Minecraft where

import Native.Function
import Syntax.IO

export Parsers.ParserCombinators
export Minecraft.Helpers
export Minecraft.Native
export Minecraft.Parsers

-- Bukkit commands in Ermine
data Command a = Command String String (Parser a) (Player -> a -> IO ())
echoCommand = Command "echo" "Repeats what you say" slurp sendMessage

-- misc stuff
zap p = getWorld p >>= (w -> getLocation p >>= strikeLightning w)
onBlockDamage f = onBlockDamage# (function2 f)