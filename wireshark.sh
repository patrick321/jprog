#!/bin/bash
sudo apt-get install wireshark
sudo apt-get install libcap2-bin
sudo groupadd wireshark
sudo usermod -a﻿ -G wireshark $1
sudo chgrp wireshark /usr/bin/dumpcap
sudo chmod 755 /usr/bin/dumpcap
sudo setcap cap_net_raw,cap_net_admin=eip /usr/bin/dumpcap
